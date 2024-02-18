package Cuentas;

/*
Clase cuenta donde estaran todos los atributos 
@version 1.0
@author Jesus Sanchez Miguel
*/
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() {
	}

	/*
	 * Metodo constructor. Recibimos nombre, cuenta, saldo y tipo de interes.
	 * 
	 * @param nom Nombre del titular
	 * 
	 * @param cue numero de cuenta
	 * 
	 * @param sal Saldo de la cuenta
	 * 
	 * @param tipo tipo de interes de esta cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	public double estado() {
		return saldo;
	}

	// Me creo todos los getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/*
	 * // Metodo para ingresar en la cuenta. Recibimos la cantidad como parametro
	 * 
	 * @param cantidad Recibimos la cantidad a ingresar
	 * 
	 * @exception Exception. Nos lanza una excepcion si se introduce una cantidad
	 * negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/*
	 * // Metodo para retirar la cuenta. Recibimos la cantidad como parametro
	 * 
	 * @param cantidad Recibimos la cantidad a retirar
	 * 
	 * @exception Exception. Nos lanza una excepcion si se introduce una cantidad
	 * negativa
	 * 
	 * @exception Exception. Nos lanza una excepcion si no hay suficiente saldo
	 * 
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

}
