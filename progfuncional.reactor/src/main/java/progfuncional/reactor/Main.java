package progfuncional.reactor;

import java.util.function.Consumer;

import reactor.core.publisher.Flux;

public class Main {

	public static void main(String[] args) {

		Flux<String> publisher = Flux.just("Mensaje inicial 1", "Mensaje inicial 2", "Mensaje inicial 3");

		Consumer<String> consumer1 = new Consumer<String>() {

			public void accept(String t) {
				System.out.println("Consumer 1");
			}
		};

		Consumer<String> consumer2 = new Consumer<String>() {

			public void accept(String t) {
				System.out.println("Consumer 2");
			}

		};

		publisher.subscribe(consumer1);
		publisher.subscribe(consumer2);
		
//		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
//        messageSender.subscribe(m -> System.out.println("Consumer 1. Received: " + m),
//                                e -> System.out.println("Consumer 1. Error: " + e.getMessage()),
//                                () -> System.out.println("Consumer 1. Completed"));
//        messageSender.subscribe(m -> System.out.println("Consumer 2. Received: " + m),
//                e -> System.out.println("Consumer 2. Error: " + e.getMessage()),
//                () -> System.out.println("Consumer 2. Completed"));
	}

}
