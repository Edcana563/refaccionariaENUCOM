import java.util.Scanner;

public class MainFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Listar guardar -> Refaccionaria maria -> reduncia de datos editar por
		 * cualquier atributo eliminar -> eliminar por cualquier atributo buscar -> por
		 * cualquier atributo compra -> cantidad x precion de compra gancias 10
		 */
		/*
		 * for(Refacciones r : lista){
		 * if(r.getNombre_refacciones.equals(newRefaccion.getNOmbre_refaccion)){
		 * sysou("la Refaccion ya esta en la lita"); }else{ guardar(newRefaccion); } }
		 */
		String nombre_refaccionaria;
		String ubicacion;
		String tipo_refaccion;
		float precio_refaccion;
		int cantidad;
		float precio_compra;
		float ganancias;
		Refaccionaria refaccion = null;
		Scanner sc = null;
		int menuMain;
		boolean stringRepetido = true;
		//declaro la implementacion para poder trabajar con los metodos de manera indirecta
		Implementation imp = new Implementation();
		do
		{
			System.out.println("******EXAMEN PRACTICO 26/01/2024**********\n1. INSERTAR NUEVO OBJETO A REFACCIONARIA\t\t\t2. BUSCAR POR CUALQUIER ATRIBUTO\n\n3. EDITAR CUALQUIER ATRIBUTO\t\t4. MOSTRAR LISTA\t 5. ELIMINAR POR CUALQUIER ATRIBUTO\t6. TERMINAR PROGRAMA");
			sc = new Scanner(System.in);
			menuMain = sc.nextInt();
		switch (menuMain)
		{
		case 1:
			System.out.println("1. NOMBRE DE LA REFACCIONARIA:");
			sc = new Scanner(System.in);
			nombre_refaccionaria = sc.nextLine();
			stringRepetido = imp.checkStringRepetido(nombre_refaccionaria);
			if(stringRepetido == true)
			{
				break;
			}
			System.out.println("2. UBICACION");
			sc = new Scanner(System.in);
			ubicacion= sc.nextLine();
			System.out.println("3. TIPO DE REFACCION:");
			sc = new Scanner(System.in);
			tipo_refaccion = sc.nextLine();
			try {
				System.out.println("4. PRECIO DE REFACCION:");
				sc = new Scanner(System.in);
				precio_refaccion = sc.nextFloat();	
			}catch(Exception e)
			{
				break;
			}
			try
			{
				System.out.println("5. CANTIDAD DE REFACCIONES:");
				sc = new Scanner(System.in);
				cantidad = sc.nextInt();
			}catch(Exception e)
			{
				break;
			}
			precio_compra = precio_refaccion * cantidad;
			ganancias = precio_compra *10;
			refaccion = new Refaccionaria(nombre_refaccionaria, ubicacion, tipo_refaccion, precio_refaccion, cantidad, precio_compra, ganancias);
			imp.save(refaccion);
			
			break;
		case 2:
			imp.show();
			int searchIndex, searchCantidad_refacciones, menuSearch;
			String searchNombre, searchUbicacion, searchRefaccion;
			do
			{
				System.out.println("Por cual atributo quieres buscar?");
				System.out.println("1. indice\t2. nombre \t3. ubicacion\t4. tipo refaccion\n5. REGRESAR");
				sc = new Scanner(System.in);
				menuSearch = sc.nextInt();
				switch(menuSearch)
				{
				case 1:
					try {
						System.out.println("Buscar por indice: ");
						sc = new Scanner(System.in);
						searchIndex = sc.nextInt();
						refaccion = new Refaccionaria();
						refaccion = imp.searchByIndex(searchIndex);
						
					}catch(Exception e)
					{
						System.out.println("Valor invalido ingresado");
					}
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 2:
					System.out.println("Buscar por nombre: ");
					sc = new Scanner(System.in);
					searchNombre = sc.nextLine();
					refaccion = new Refaccionaria();
					refaccion = imp.searchByNombre(searchNombre);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 3: 
					System.out.println("Buscar por ubicacion: ");
					sc = new Scanner(System.in);
					searchUbicacion = sc.nextLine();
					refaccion = new Refaccionaria();
					refaccion = imp.searchByUbicacion(searchUbicacion);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 4: 
					System.out.println("Buscar por tipo de refaccion: ");
					sc = new Scanner(System.in);
					searchRefaccion = sc.nextLine();
					refaccion = new Refaccionaria();
					refaccion = imp.searchByRefaccion(searchRefaccion);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
				case 5: 
					break;
					
				}
			}while(menuSearch > 0 && menuSearch < 5);
			//buscar
			
			break;
		case 3: //edit
			imp.show();
			int editIndex, editCantidad_refacciones, menuEdit = 0;
			float editPrecio;
			String editNombre, editUbicacion, editRefaccion;
			System.out.println("Buscar por indice");
			sc = new Scanner(System.in);
			editIndex = sc.nextInt();
			refaccion = new Refaccionaria();
			refaccion = imp.searchByIndex(editIndex);
			if(refaccion == null)
			{
			break;	
			}
			try
			{
				System.out.println("Editar: 1. nombre \t2. ubicacion\t3. tipo refaccion\n5. REGRESAR");
				sc =  new Scanner(System.in);
				menuEdit = sc.nextInt();
			}catch(Exception e)
			{
				System.out.println("Invalido");
				break;
			}
			do
			{
				//editNombre, editUbicacion, editRefaccion;
				switch(menuEdit) 
				{
				case 1: //indice
					System.out.println("Editar nombre: ");
					sc = new Scanner(System.in);
					editNombre = sc.nextLine();
					refaccion.setNombre_refaccionaria(editNombre);
					imp.show();
					break;
				case 2:
					System.out.println("Editar ubicacion: ");
					sc = new Scanner(System.in);
					editUbicacion = sc.nextLine();
					refaccion.setUbicacion(editUbicacion);
					imp.show();
					break;
				case 3:
					System.out.println("Editar tipo de refaccion: ");
					sc = new Scanner(System.in);
					editRefaccion = sc.nextLine();
					refaccion.setTipo_refaccion(editRefaccion);
					imp.show();
					break;
				case 4:
					System.out.println("Editar precio: ");
					sc = new Scanner(System.in);
					editPrecio = sc.nextFloat();
					refaccion.setPrecio_refaccion(editPrecio);
					precio_compra = editPrecio * refaccion.getCantidad();
					ganancias = precio_compra *10;
					refaccion.setPrecio_compra(precio_compra);
					refaccion.setGanancias(ganancias);
					imp.show();
					break;
				case 5: 
					break;
				}
				System.out.println("Editar: 1. nombre \t2. ubicacion\t3. tipo refaccion\t4. Precio\t5. REGRESAR");
				sc =  new Scanner(System.in);
				menuEdit = sc.nextInt();
			}while(menuEdit > 0 && menuEdit < 5);
			
						
			//editar
			break;
		case 4:
			imp.show();
			break;
		case 5://eliminar
			do
			{
				imp.show();
				System.out.println("Por cual atributo quieres eliminar?");
				System.out.println("1. indice\t2. nombre \t3. ubicacion\t4. tipo refaccion\t5. REGRESAR");
				sc = new Scanner(System.in);
				menuSearch = sc.nextInt();
				switch(menuSearch)
				{
				case 1:
					try {
						System.out.println("Buscar por indice: ");
						sc = new Scanner(System.in);
						searchIndex = sc.nextInt();
						refaccion = new Refaccionaria();
						imp.delete(searchIndex);
						System.out.println("Se eliminará el indice");
					}catch(Exception e)
					{
						System.out.println("Valor invalido ingresado");
					}
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 2:
					System.out.println("Buscar por nombre: ");
					sc = new Scanner(System.in);
					searchNombre = sc.nextLine();
					imp.deleteByNombre(searchNombre);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 3: 
					System.out.println("Buscar por ubicacion: ");
					sc = new Scanner(System.in);
					searchUbicacion = sc.nextLine();
					refaccion = new Refaccionaria();
					imp.deleteByUbicacion(searchUbicacion);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
					
				case 4: 
					System.out.println("Buscar por tipo de refaccion: ");
					sc = new Scanner(System.in);
					searchRefaccion = sc.nextLine();
					refaccion = new Refaccionaria();
					imp.deleteByRefaccion(searchRefaccion);
					if(refaccion == null)
					{
						System.out.println("No se encontró");
					}
					break;
				case 5: 
					break;
					
				}
			}while(menuSearch > 0 && menuSearch < 5);
			break;
		case 6:
			break;
		}
		}while(menuMain > 0 && menuMain < 6);
		
	}

}
