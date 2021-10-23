package Exercicio;
import java.net.InetAddress;
import java.util.TimerTask;

public class TestadorConexao extends TimerTask {
	private String hostName;
	public TestadorConexao(String pHost)
	{
		hostName = pHost;
	}
	@Override
	public void run() {
		testaConexao();
	}
	private void testaConexao()
	{ 
		
		// classe representa um computador em rede
		InetAddress host;
		try {
			
			// instancia a classe com as informa��es de um IP ou nome de um host
			host = InetAddress.getByName(hostName);
			
			// verifica se o host est� comunic�vel com um timeout de 2 segundos
			if (host.isReachable(2000) == true)
			{
				System.out.println("Host "+ hostName + " online.");
			}else {
				System.out.println("Host "+ hostName + " offline.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
