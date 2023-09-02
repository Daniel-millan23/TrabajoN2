package org.example;

class EmpleadoIndefinido extends Empleado {

    public EmpleadoIndefinido(String nombre, String apellido, int salario, int tiempoContrato) {
        super(nombre, apellido, salario, tiempoContrato);
        if (getTiempoContrato() > 6) {
            sethasVacaciones(true);
        } else {
            sethasVacaciones(false);
        }

    }
@Override
    public int pagarFiniquito() {
        return getSalario()*getTiempoContrato();
    }

    public int darVacaciones() {

        if (isHasVacaciones()) {
            return super.darVacaciones();
        } else {
            throw new Error("El empleado no tiene derecho a vacaciones.");
        }

    }
}



