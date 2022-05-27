package br.com.caleum.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {

//	Agendando a cada 10 segundos dia da semana "Sun", "Mon"...
	@Schedule(dayOfWeek = "Fri", hour = "*", minute = "*", second = "*/10", persistent = false)
	void agendado() {
		System.out.println("Verificando serviço externo periodicamente...");
	}

}
