package Exercicio;
import java.util.Timer;



public class MonitorComputador {
	private Timer timer;
	private TestadorConexao testador;
	public MonitorComputador(String pHost)
	{
		testador = new TestadorConexao(pHost);
		timer = new Timer();
		timer.schedule(testador, 0,5000);
	}
	public static void main(String[] args) {
		MonitorComputador mc = new MonitorComputador("8.8.8.8");
		MonitorComputador mc1 = new MonitorComputador("8.8.2.1");
		MonitorComputador mc2 = new MonitorComputador("65.8.246.136");
	}

}
