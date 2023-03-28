package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aeropuerto {

	private List<Vuelo> listaVuelos;

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

	public void fechaLlegada(List<Vuelo> lista) {
		for (Vuelo v : listaVuelos) {
			v.setHoraLlegada(v.getHoraSalida().plusHours(v.getDuracion().getHour()));
		}
	}

	public List<Vuelo> filtrarVuelo(Vuelo v1) {
		return listaVuelos.stream()
				.filter(v -> v.getId() != v1.getId())
				.toList();
	}

	public List<Vuelo> coinciden (List<Vuelo> ls) {
	List<Vuelo> mismashoras = new ArrayList<>();
        for (int i = 0; i < ls.size(); i++) {
            Vuelo vueloActual  = ls.get(i);
            if (ls.stream()
                      .filter(v -> !v.equals(vueloActual))
                      .anyMatch(v -> v.getHoraLlegada().getHour() == vueloActual.getHoraLlegada().getHour())) {
                mismashoras.add(vueloActual);
            }
        }
        return mismashoras;
	}
	
	public void buscarVuelo(String Id) {
		listaVuelos.stream()
		.filter(v->v.getId().equalsIgnoreCase(Id))
		.forEach(System.out::println);
	}

}
