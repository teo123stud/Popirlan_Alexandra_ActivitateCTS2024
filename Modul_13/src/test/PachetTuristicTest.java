package test;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.dubluri.PersoanaFake;
import test.categorii.CuMock;
import test.categorii.FaraMock;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(FaraMock.class)
    public void  testeazaCorectitudineAplicaDiscount(){
        IPersoana client=new Persoana("Maria","12403236254");
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 1",22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void aplicaDisocuntBoundary(){
        IPersoana client= new Persoana("Ion", "1021118520090");
        PachetTuristic pachetTuristic= new PachetTuristic(client, "Puerto Rico", 10.00);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(8, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CuMock.class)
    public void testVerificaDiscountFake(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 2",30.0);
        client.setValoareGetSex("F");
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(27,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void testVerificaNuAplicaDiscountFake(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 2",30.0);
        client.setValoareGetSex("F");
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount100(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 2",30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount0(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 2",30.0);
        client.setValoareGetVarsta(18);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(30.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscount1(){
        PersoanaFake client= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(client,"Destinatie 2",30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(29.7,pachetTuristic.getPret(),0.01);
    }

}