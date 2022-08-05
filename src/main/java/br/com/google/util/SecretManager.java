package br.com.google.util;


import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;
import software.amazon.awssdk.services.secretsmanager.model.UpdateSecretRequest;

import java.util.logging.Logger;

@Slf4j
public class SecretManager {

   static Logger logger = Logger.getLogger(SecretManager.class.getName());


    public static String getValue(){

        String secretName = "arn:aws:secretsmanager:us-east-1:772742445677:secret:sample-JmVIcW";
        String newToken = "Realizada a update";

        SecretsManagerClient secretsManagerClient = SecretsManagerClient.builder()
                .region(Region.US_EAST_1)
                .build();

        GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
                .secretId(secretName)
                .build();

        GetSecretValueResponse getSecretValueResponse = secretsManagerClient.getSecretValue(getSecretValueRequest);
        String response = getSecretValueResponse.secretString();

        logger.info("GetSecretValueResponse " + getSecretValueResponse);


        logger.info("Response Pre Update: " + response);

        updateSecret(secretsManagerClient,secretName, "{\"token\":\"update chave e valor\"}");

        GetSecretValueRequest getSecretValueRequestPosUp = GetSecretValueRequest.builder()
                .secretId(secretName)
                .build();

        GetSecretValueResponse getSecretValueResponsePOS = secretsManagerClient.getSecretValue(getSecretValueRequestPosUp);
        String NOVOtoKEN = getSecretValueResponsePOS.secretString();

        logger.info("Response POS Update: " + NOVOtoKEN);

        return NOVOtoKEN;
    }

    private static void updateSecret(SecretsManagerClient secretsManagerClient, String secretName, String newToken) {

        UpdateSecretRequest updateSecretRequest = UpdateSecretRequest.builder()
                .secretId(secretName)
                .secretString(newToken)
                .build();

        secretsManagerClient.updateSecret(updateSecretRequest);

    }


}
