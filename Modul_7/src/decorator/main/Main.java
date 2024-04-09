package decorator.main;

import decorator.decorator.AplicatieMobila;
import decorator.decorator.Decorator;
import decorator.decorator.WebSite;
import decorator.spital.Diagnostic;
import decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {

        DiagnosticAbstract diagnostic = new Diagnostic("raceala","tuse",false);
        diagnostic.printeazaDiagnostic();

        System.out.println(" ");
        Decorator decorator=new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        System.out.println(" ");
        Decorator website= new WebSite(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnostic();
    }
}