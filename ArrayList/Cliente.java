/*
Fai unha clase Cliente, con atributos nome, tfno, email. 
Fai agora unha clase AppClienteLista que defina unha lista de clientes, 
e mostrará un menú para:

 * introducir un cliente novo

 * mostrar todos os clientes

 * saír

Comproba que funciona introducindo 4 clientes diferentes.
*/

public class Cliente {
    
    private String nome;
    private String tfno;
    private String email;
    
    public Cliente(String nome, String tfno, String email) {
        this.nome = nome;
        this.tfno = tfno;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTfno() {
        return tfno;
    }

    public void setTfno(String tfno) {
        this.tfno = tfno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}