import java.util.ArrayList;
import java.util.List;

public class Implementation implements Methods{

	
	//Create a list to work with
	List<Refaccionaria> lista = new ArrayList<Refaccionaria>();

	@Override
	public void save(Refaccionaria obj) {
		// TODO Auto-generated method stub
		lista.add(obj);
	}

	@Override
	public Refaccionaria searchByIndex(int index) {
		// TODO Auto-generated method stub
		System.out.println(lista.get(index));
		return lista.get(index);
	}

	public Refaccionaria searchByNombre(String nombre)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(nombre.equals(lista.get(x).getNombre_refaccionaria())) {
				System.out.println("Encontrada!" +lista.get(x).getNombre_refaccionaria());
				System.out.println(lista);
				return lista.get(x);
			}
			
		}
		return null;
	}
	public Refaccionaria searchByUbicacion(String ubicacion)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(ubicacion.equals(lista.get(x).getUbicacion())) {
				System.out.println("Encontrada!" +lista.get(x).getUbicacion());
				System.out.println(lista);
				return lista.get(x);
			}
			
		}
		return null;
	}
	
	public Refaccionaria searchByRefaccion(String refaccion)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(refaccion.equals(lista.get(x).getTipo_refaccion())) {
				System.out.println("Encontrada!" +lista.get(x).getTipo_refaccion());
				System.out.println(lista);
				return lista.get(x);
			}
			
		}
		return null;
	}
	
	@Override
	public void edit(int index, Refaccionaria obj) {
		// TODO Auto-generated method stub
		lista.set(index, obj);
		
	}

	@Override
	public void delete(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}
	
	public void deleteByNombre(String nombre)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(nombre.equals(lista.get(x).getNombre_refaccionaria())) {
				System.out.println("Encontrada!" +lista.get(x).getNombre_refaccionaria());
				delete(x);
				System.out.println(lista);
			}
			
		}
	}
	public void deleteByUbicacion(String ubicacion)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(ubicacion.equals(lista.get(x).getUbicacion())) {
				System.out.println("Encontrada!" +lista.get(x).getUbicacion());
				delete(x);
				System.out.println(lista);
			}
			
		}
	}
	public void deleteByRefaccion(String ref)
	{
		for(int x = 0; x<lista.size(); x++)
		{
			if(ref.equals(lista.get(x).getTipo_refaccion())) {
				System.out.println("Encontrada!" +lista.get(x).getTipo_refaccion());
				delete(x);
				System.out.println(lista);
			}
			
		}
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		for(int x = 0; x<lista.size(); x++)
		{
			System.out.println("["+x+"] "+lista.get(x));	
		}
	}
	public boolean checkStringRepetido(String stringcheck) {
		for(int x = 0; x < lista.size(); x++)
		{
			if(stringcheck.equals(lista.get(x).getNombre_refaccionaria()))
			{
			System.out.println("La cadena está repetida.");	
			return true;
			}
		}
		return false;
	}

}
