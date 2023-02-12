package Programmer.familiarityWithJava.hw6_JAVA;

public class Seminar6_2 {
    private String model;
    private String color;
    private String diagonal;
    private String proc;
    private String gpu;
    private String ram;
    private String hdd;
    private String os;

    public Seminar6_2(String model, String color, String diagonal, String proc, String gpu, String ram, String hdd, String os){
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.proc = proc;
        this.gpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public String toString() {
        return this.model + " " + 
                this.color + " " + 
                this.diagonal + " " + 
                this.proc + " " + 
                this.gpu + " " + 
                this.ram + " " + 
                this.hdd + " " + 
                this.os;
    }

    public String getParam(String param) {
        switch (param) {
            case "model": return this.model;
            case "color": return this.color;
            case "diagonal": return this.diagonal;
            case "proc": return this.proc;
            case "gpu": return this.gpu;
            case "ram": return this.ram;
            case "hdd": return this.hdd;
            case "os": return this.os;
        }
        return ""; 
    }

    public String getModel() {
        return this.model;        
    }

    public String getColor() {
        return this.color;
    }

    public String getDiagonal() {
        return this.diagonal;
    }

    public String getProc() {
        return this.proc;
    }

    public String getGpu() {
        return this.gpu;
    }

    public String getRam() {
        return this.ram;
    }

    public String getHdd() {
        return this.hdd;
    }

    public String getOs() {
        return this.os;
    }

    public void setModel(String model) {
        this.model = model;
        return;        
    }

    public void setColor(String color) {
        this.color = color;
        return;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
        return;
    }

    public void setProc(String proc) {
        this.proc = proc;
        return;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
        return;
    }

    public void setRam(String ram) {
        this.ram = ram;
        return;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
        return;
    }

    public void setOs(String os) {
        this.os = os;
        return;
    }
}