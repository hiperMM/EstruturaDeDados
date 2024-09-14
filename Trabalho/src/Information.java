public class Information {

    private String ID;
    private String Nome;
    private String Serviço;


    public Information(String ID, String Nome, String Serviço) {
        this.ID = ID;
        this.Nome = Nome;
        this.Serviço = Serviço;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getServiço() {
        return this.Serviço;
    }

    public void setServiço(String Serviço) {
        this.Serviço = Serviço;
    }
    

    public String toStringPilha() {
        return "{" +
            " ID='" + getID() + "'" +
            ", serviço='" + getNome() + "'" +
            ", data='" + getServiço() + "'" +
            "}";
    }

    public String toStringFila() {
        return "{" +
            " ID='" + getID() + "'" +
            ", nome='" + getNome() + "'" +
            ", serviço='" + getServiço() + "'" +
            "}";
    }

    
}
