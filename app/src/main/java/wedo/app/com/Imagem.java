package wedo.app.com;

public class Imagem {

    private int Imagem;
    private String Uid;

    public Imagem(int imagem, String uid) {
        Imagem = imagem;
        Uid = uid;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }
}
