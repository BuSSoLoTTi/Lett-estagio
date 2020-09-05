package com.company.animais.classes;

import com.company.caracteristica.AnimalVoador;
import com.company.animais.Animal;

public abstract class Ave extends Animal implements AnimalVoador {
    private float altitude;
    private int ovosBotados;
    private String corPena;

    abstract public void botarOvo();

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public int getOvosBotados() {
        return ovosBotados;
    }

    public void setOvosBotados(int ovosBotados) {
        this.ovosBotados = ovosBotados;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "altitude=" + altitude +
                ", ovosBotados=" + ovosBotados +
                ", corPena='" + corPena + '\'' +
                "} " + super.toString();
    }
}
