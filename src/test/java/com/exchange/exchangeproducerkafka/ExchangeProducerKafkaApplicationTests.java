package com.exchange.exchangeproducerkafka;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.binder.test.OutputDestination;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.converter.CompositeMessageConverter;
import org.springframework.messaging.converter.MessageConverter;

@SpringBootTest
class ExchangeProducerKafkaApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Test
//	public void testProducer() {
//		try (ConfigurableApplicationContext context = new SpringApplicationBuilder(
//				TestChannelBinderConfiguration
//						.getCompleteConfiguration(ExchangeProducerKafkaApplicationTests.class))
//				.web(WebApplicationType.NONE)
//				.run()) {
//
//			OutputDestination target = context.getBean(OutputDestination.class);
//			Message<byte[]> sourceMessage = target.receive(10000);
//
//			final MessageConverter converter = context.getBean(CompositeMessageConverter.class);
//			Quote quote = (Quote) converter
//					.fromMessage(sourceMessage, Quote.class);
//
//			LocalDate localDate = LocalDate.now();
//			assertThat(quote.getPayload().getDate_ts()).isEqualTo(localDate.toString());
//		}
//	}
}
