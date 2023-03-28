package ejercicio2;

import java.util.List;

public class Aeropuerto {

	private List <Vuelo> listaVuelos;

	public Aeropuerto(List<Vuelo> listaVuelos) {
		super();
		this.listaVuelos = listaVuelos;
	}

	public List<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(List<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

	@Override
	public String toString() {
		return "Aeropuerto [listaVuelos=" + listaVuelos + "]";
	}
	
	public void fechaLlegada (List<Vuelo> lista) {
		for(Vuelo v : listaVuelos) {
			v.setHoraLlegada(v.getHoraSalida().plus);;
		}
	}
}
