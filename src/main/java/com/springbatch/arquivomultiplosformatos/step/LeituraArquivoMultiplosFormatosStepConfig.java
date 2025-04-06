package com.springbatch.arquivomultiplosformatos.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.net.server.Client;

@Configuration
public class LeituraArquivoMultiplosFormatosStepConfig {
	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@SuppressWarnings("unchecked")
	@Bean
	public Step leituraArquivoMultiplosFormatosStep(
			MultiResourceItemReader<Client> multiplosArquivosClientesTransacaoReader,
			@SuppressWarnings("rawtypes") ItemWriter leituraArquivoMultiplosFormatosItemWriter) {
		return stepBuilderFactory
				.get("leituraArquivoMultiplosFormatosStep")
				.chunk(1)
				.reader(multiplosArquivosClientesTransacaoReader)
				.writer(leituraArquivoMultiplosFormatosItemWriter)
				.build();
	}
}
