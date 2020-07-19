package br.com.estudo.transaction.api;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE, method = RequestMethod.GET   )
    @ResponseBody
    public Mono<String> getHello() {
        return Mono.just("Olá, bem-vindo! ");
    }


}