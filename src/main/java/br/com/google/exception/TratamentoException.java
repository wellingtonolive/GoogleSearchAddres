package br.com.google.exception;

import io.smallrye.common.function.ExceptionFunction;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


public class TratamentoException implements ExceptionFunction {




    @Override
    public Object apply(Object o) throws Exception {

        System.out.println("Caiu no tratamento");

        return null;
    }

    /*
    * https://developers.redhat.com/articles/2022/03/03/rest-api-error-modeling-quarkus-20#update_the_validation_messages
    * https://quarkus.io/guides/transaction
    * */
}
