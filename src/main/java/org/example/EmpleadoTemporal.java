package org.example;

class EmpleadoTemporal extends Empleado{
    private boolean isRenovado;
    private boolean hasVacaciones;
    public EmpleadoTemporal(String nombre, String apellido, int salario, int tiempoContrato){
        super(nombre, apellido, salario, tiempoContrato);
        this.isRenovado=false;
        this.hasVacaciones=false;
    }
    public void extenderContrato(int meses){
        this.isRenovado=true;
        setTiempoContrato(getTiempoContrato()+meses);
        if (getTiempoContrato()>=6){
            hasVacaciones=true;
        }else{
            hasVacaciones=false;
        }
        }
    public int darVacaciones() {
        if (hasVacaciones) {
            return super.darVacaciones();
        } else {
            throw new Error("El empleado no tiene derecho a vacaciones.");
        }
    }
    }

