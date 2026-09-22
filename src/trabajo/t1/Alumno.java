/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.t1;

/**
 *
 * @author UCA40428
 */
public class Alumno 
{
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String nmrodocuemnto;
    private String nivelSocioEconomico;
    private String tipoBeca;
    private double pension;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNmrodocuemnto() {
        return nmrodocuemnto;
    }

    public void setNmrodocuemnto(String nmrodocuemnto) {
        this.nmrodocuemnto = nmrodocuemnto;
    }

    public String getNivelSocioEconomico() {
        return nivelSocioEconomico;
    }

    public void setNivelSocioEconomico(String nivelSocioEconomico) {
        this.nivelSocioEconomico = nivelSocioEconomico;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
    
    public double pensionFinal()
    {
    double descuento=0;
        if (tipoBeca.equalsIgnoreCase("parcial"))
        {
            descuento = 0.50;
        }
        else
            if (tipoBeca.equalsIgnoreCase("Total"))
        {
        descuento = 1;
        
        }
        return
                pension-(pension*descuento);
    }
    public void verDatos()
    {
         System.out.println("DOCUMENTO: "+this.tipoDocumento+" NMRODOCUMENTO: "+
                this.nmrodocuemnto+" NOMBRE: "+this.nombre+" APELLIDO: "+
                this.apellido+ " NIVELSOCIOECONOMICO: "+this.nivelSocioEconomico+
                " BECA: "+this.tipoBeca+"PENSION: "+pension);
    }
    
}


