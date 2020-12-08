package br.com.alura.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("fornecedor")
public interface FornecedorClient {

}
