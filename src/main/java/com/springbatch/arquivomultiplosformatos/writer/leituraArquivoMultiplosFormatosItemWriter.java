package com.springbatch.arquivomultiplosformatos.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class leituraArquivoMultiplosFormatosItemWriter {
    @Bean
    public ItemWriter<Object> leituraArquivoDelimitadoWriter() {
        return items -> items.forEach(System.out::println);
    }
}