package org.sidd.entities;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService

public class BanqueWs {

    @WebMethod
    public double convert(@WebParam double mt){
        return mt*11.13;
    }

    @WebMethod
    public  Compte getConpte(long code){
        return  new Compte(code, Math.random()*8799,new Date());
    }

    @WebMethod
    public List<Compte> comptes(){
        return  List.of( new Compte(1, Math.random()*8799,new Date()),
                new Compte(2, Math.random()*8799,new Date()),
                new Compte(3, Math.random()*7899,new Date()),
                new Compte(1, Math.random()*4599,new Date()),
                new Compte(1, Math.random()*8790,new Date())
                );
    }
}
