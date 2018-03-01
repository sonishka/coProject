package Classes;

import java.util.Date;

/**
 * Created by lenovo on 01/03/2018.
 */

public class Membre {
    private String email ;
    private String nom ;
    private String prenom ;
    private String password;
    private int NumeroTel ;
    private Date anneeNaiss ;
    private String photo ;
    private String minibio ;
    public Membre (String Email,String Nom,String Prenom,String Password,int NumeroTel,Date AnneeNaiss,String Photo,
                   String Minibio){
        this.email=Email ; this.nom=Nom ;
        this.prenom=Prenom ; this.password = Password ;
        this.anneeNaiss=AnneeNaiss;
        this.minibio=Minibio ;
    }


}
