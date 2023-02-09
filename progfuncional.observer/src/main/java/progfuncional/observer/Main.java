package progfuncional.observer;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {

	public static void main(String[] args) {

		Observable<String> observable = Observable.just("Mensaje inicial");
		Observer<String> observer1 = new Observer<String>() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer 1 suscrito");
			}

			public void onNext(String t) {
				System.out.println("Observer 1 ha recibido el texto : " + t);
			}

			public void onError(Throwable e) {
				System.out.println("Error de observer 1: " + e.getMessage());
			}

			public void onComplete() {

			}

		};
		Observer<String> observer2 = new Observer<String>() {

			public void onSubscribe(Disposable d) {

			}

			public void onNext(String t) {
				System.out.println("Observer 2 ha recibido el texto : " + t);
			}

			public void onError(Throwable e) {
				System.out.println("Error de observer 1: " + e.getMessage());
			}

			public void onComplete() {

			}

		};

		observable.subscribe(observer1);
		observable.subscribe(observer2);

	}

}
