package Practica;

import java.io.*;

public class Writer2 {

	public static void main(String[] args) {

		try {
			PrintWriter salida = new PrintWriter(
					"C://Users//Java//eclipse-workspace//Practica Inicial//src//Practica//Lista.bad");
			File file = new File("C://Users//Java//eclipse-workspace//Practica Inicial//src//Practica//Lista");
			FileReader fr = new FileReader(file);
			FileReader fr2 = new FileReader(file);
			int data = fr.read();
			int data2 = fr2.read();
			int CantidadAlunmos = 1;
			String parametro1 = args[0];

			/*
			 * Abre y lee archivo para comprobar cantidad maxima de alumnos
			 */

			while (data != -1) {
				if (data == 13) {   // Data igual a 13 porque busaca caracter final delinea 
					CantidadAlunmos = CantidadAlunmos + 1;
				}
				data = fr.read();
		
			}

			/* Carga los datos leidos en Matriz bidimencional */

			String Alumnos[][] = new String[1000][20];
			int x = 0;
			int m = 0;
			String Entrada = "";

			while (data2 != -1) {
				if (data2 == 44) { // 44 = valor de la "," 

					Alumnos[x][m] = Entrada;
					Entrada = "";
					m = m + 1;
					data2 = fr2.read();
				}
				if (data2 == 13) {
					Alumnos[x][m] = Entrada;
					Entrada = "";
					x = x + 1;
					m = 0;
				}
				if (data2 == 10) {
					Entrada = "";
					data2 = fr2.read();
				} else {
					Entrada = Entrada + ((char) data2);
					data2 = fr2.read();
				}

			}
			Alumnos[x][m] = Entrada;
			fr.close();
			fr2.close();

			System.out.println("***********************  Programa TP1  ***********************************");
			System.out.println();

			/******************************************************************
			 * /* Valida los datos cargados en la matriz y genera el archivo .bad
			 */

			String Validacion[] = new String[6];
			Double Prom = 0.0;
			int Re = -1;
			int InDef = 0;

			for (int i = 0; i < CantidadAlunmos; i++) {
				if (Alumnos[i][0] != null) {
					Validacion[0] = Alumnos[i][0];
					Validacion[0] = Validacion[0].replaceAll("[0-9]", "");
				}

				if (Alumnos[i][1] != null) {
					Validacion[1] = Alumnos[i][1];
					Validacion[1] = Validacion[1].replaceAll("[^0-9]", "");
				}
				if (Alumnos[i][2] != null) {
					Validacion[2] = Alumnos[i][2].replaceAll("M", "");
					Validacion[2] = Validacion[2].replaceAll("m", "");
					Validacion[2] = Validacion[2].replaceAll("F", "");
					Validacion[2] = Validacion[2].replaceAll("f", "");
				}
				if (Alumnos[i][3] != null) {
					Validacion[3] = Alumnos[i][3];
					Validacion[3] = Validacion[3].replaceAll("[0-9]", "");
				}
				if (Alumnos[i][4] != null) {
					Validacion[4] = Alumnos[i][4];
					Validacion[4] = Validacion[4].replaceAll("[0-9]", "");
				}
				if (Alumnos[i][5] != null) {
					Validacion[5] = Alumnos[i][5];
					Validacion[5] = Validacion[5].replaceAll("[0-9]", "");
					Validacion[5] = Validacion[5].replace(".", "");
					if (Validacion[5].compareTo("") == 0) {
						Prom = Double.parseDouble(Alumnos[i][5]);
					}
				}

				if (Alumnos[i][5] == (null) || Validacion[0].compareTo("") != 0 || Validacion[1].compareTo("") != 0
						|| Validacion[2].compareTo("") != 0 || Validacion[3].compareTo("") != 0
						|| Validacion[4].compareTo("") != 0 || Validacion[5].compareTo("") != 0 || Prom < 0
						|| Prom > 100) {
					System.out.println("Linea " + (i + 1) + " posee datos indefinidos");
					salida.print(Alumnos[i][0] + "," + Alumnos[i][1] + "," + Alumnos[i][2] + "," + Alumnos[i][3] + ","
							+ Alumnos[i][4] + "," + Alumnos[i][5] + (char) 13 + (char) 10);
					InDef = InDef + 1;

				} else {

					Re = Re + 1;

					Alumnos[Re][0] = Alumnos[i][0];
					Alumnos[Re][1] = Alumnos[i][1];
					Alumnos[Re][2] = Alumnos[i][2];
					Alumnos[Re][3] = Alumnos[i][3];
					Alumnos[Re][4] = Alumnos[i][4];
					Alumnos[Re][5] = Alumnos[i][5];
					Alumnos[Re][6] = Alumnos[i][6];
				}

			}

			salida.close();
			CantidadAlunmos = Re + 1;
			
			if (InDef > 0) {
				System.out.println();
				System.out.println("Se encontro la siguiente cantidad de registros con datos indefinidos :" + InDef);
				System.out.println();
				System.out.println("Se ha generado el archivo Lista.bad correspondiente.");
				System.out.println();
				System.out.println("**************************************************************************");
			}

			if (CantidadAlunmos<5) {
				System.out.println();
				System.out.println("La lista tiene pocos registros utiles para ser procesada");	
				System.exit(0);
							}
			
			if (CantidadAlunmos>100) {
				System.out.println();
				System.out.println("La lista tiene demasiados registros para ser procesada");	
				System.exit(1);
							}
			
			/* calcula el promedio de notas y lo coloca en posicion Alumnos m6 */;

			for (int i = 0; i < CantidadAlunmos; i++) {
				Alumnos[i][6] = String
						.valueOf((Double.parseDouble(Alumnos[i][3]) + Double.parseDouble(Alumnos[i][4])) / 2);
			}

			/* 2.1 Los nombres de los 5 mejores promedios (indicar dni, nombre y nota) */

			String pro[][] = new String[1][7];
			for (int i = 0; i < CantidadAlunmos; i++) {
				for (int j = 0; j < CantidadAlunmos; j++) {

					if (Double.parseDouble(Alumnos[i][6]) > (Double.parseDouble(Alumnos[j][6]))) {

						pro[0][0] = Alumnos[i][0];
						pro[0][1] = Alumnos[i][1];
						pro[0][2] = Alumnos[i][2];
						pro[0][3] = Alumnos[i][3];
						pro[0][4] = Alumnos[i][4];
						pro[0][5] = Alumnos[i][5];
						pro[0][6] = Alumnos[i][6];

						Alumnos[i][0] = Alumnos[j][0];
						Alumnos[i][1] = Alumnos[j][1];
						Alumnos[i][2] = Alumnos[j][2];
						Alumnos[i][3] = Alumnos[j][3];
						Alumnos[i][4] = Alumnos[j][4];
						Alumnos[i][5] = Alumnos[j][5];
						Alumnos[i][6] = Alumnos[j][6];

						Alumnos[j][0] = pro[0][0];
						Alumnos[j][1] = pro[0][1];
						Alumnos[j][2] = pro[0][2];
						Alumnos[j][3] = pro[0][3];
						Alumnos[j][4] = pro[0][4];
						Alumnos[j][5] = pro[0][5];
						Alumnos[j][6] = pro[0][6];

					}
				}
			}
			/* Se imprimen los 5 mejores promedios */

			System.out.println();
			System.out.println();
			System.out.println((char) 34 + "Mejores promedios" + (char) 34 + ":"); 
			for (int i2 = 0; i2 <= 4; i2++) {
				System.out.println((char) 34 + "Alumno" + (i2 + 1) + (char) 34 + ":");
				System.out.println("{");
				System.out.println("    " + "DNI:" + Alumnos[i2][0] + ",");
				System.out.println("    " + "Nombre:" + Alumnos[i2][1] + ",");
				System.out.println("    " + "Promedio:" + Alumnos[i2][6] + ",");
				System.out.println("},");

			}

			System.out.println((char) 34 + "Datos Estadisticos" + (char) 34 + ":");
			System.out.println("{");
			/* Se calcula el promedio general del curso */
			double prom = 0;
			for (int i = 0; i < CantidadAlunmos; i++) {
				prom = prom + (Double.parseDouble(Alumnos[i][6]));
			}

			System.out.println(
					"    " + "PromGeneral:" + ((double) Math.round((prom / CantidadAlunmos) * 100) / 100) + ",");

			/*
			 * 2.3 La cantidad de aprobados (la nota con la que se aprueba es parámetro del
			 * programa)
			 */

			int Aprobados = 0;
			for (int i = 0; i < CantidadAlunmos; i++) {

				if ((Double.parseDouble(parametro1)) <= (Double.parseDouble(Alumnos[i][6]))) {
					Aprobados = Aprobados + 1;
				}

			}

			System.out.println("    " + "CantAprobados:" + Aprobados + ",");

			/* Punto 2.4 Promedio de asistencia por genero */

			Double ProFe = 0.0;
			Double ProMa = 0.0;
			int ConFe = 0;
			int ConMa = 0;

			for (int i = 0; i < CantidadAlunmos; i++) {
				if (Alumnos[i][2].equalsIgnoreCase("F")) {

					ProFe = ProFe + Double.parseDouble(Alumnos[i][5]);
					ConFe = ConFe + 1;
				}
				if (Alumnos[i][2].equalsIgnoreCase("M")) {
					ProMa = ProMa + Double.parseDouble(Alumnos[i][5]);
					ConMa = ConMa + 1;
				}

			}
			Double ProAsisFem1;
			Double ProAsisMas1;
			ProAsisFem1 = ProFe / ConFe;
			ProAsisMas1 = ProMa / ConMa;
			ProAsisFem1 = (double) Math.round(ProAsisFem1 * 100) / 100;
			ProAsisMas1 = (double) Math.round(ProAsisMas1 * 100) / 100;

			System.out.println("    PromAsistFem:" + ProAsisFem1 + ",");
			System.out.println("    PromAsisMas:" + ProAsisMas1 + ",");

			/* Punto 2.5 Cantidad de desaprobados con asistencia mayor al 75% */

			int ConDes = 0;
			for (int i = 0; i < CantidadAlunmos; i++) {
				if (Double.parseDouble(Alumnos[i][5]) > 75) {
					if ((Double.parseDouble(parametro1)) >= (Double.parseDouble(Alumnos[i][6]))) {
						ConDes = ConDes + 1;
					}
				}
			}
			System.out.println("    " + "CanDesAsisMay75:" + ConDes + ",");
			System.out.println("},");

		} catch (IOException ex) {
			System.out.println("El archivo no ha sido encontrado ");
			ex = null;
		}

	}
}