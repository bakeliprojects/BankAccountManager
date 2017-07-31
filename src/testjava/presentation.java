/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import entite.Account;
import entite.CheckingAccount;
import entite.SavingAccount;
import entite.BusinessAccount;
import java.util.Scanner;

/**
 *
 * @author nogsdiva
 */
public class presentation {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       
       /* Account a1 = new CheckingAccount(10,10000,50000); 
        int code1 = a1.getCode();
        Account a2 = new SavingAccount(11,2000,3000);
        int code2 = a2.getCode();
        */
           
      
        
       System.out.println("choisir un compte");
       System.out.println("1:cheickingAccount");
       System.out.println("2:savingAccount");
       System.out.println("3:BusinessAccount");
       int choix = sc.nextInt();
       if(choix==1|choix==2|choix==3){
                    
       System.out.println("quelle est votre operation:\n1:Versement");
       System.out.println("2:retrait");
       System.out.println("3:virement");
       int op = sc.nextInt();
       
      if(op==1 & choix==1){
             
       System.out.println("entrer le montant a verser");
       int mt = sc.nextInt();
       Account a1 = new CheckingAccount(10,10000,500000);
       int code1 = a1.getCode();
      System.out.println("le montant a verser est :" + mt+ "f");
       a1.verser(mt);
       System.out.println(a1.afficher(code1));       
       }
       
       
       else if (op==1 & choix==2){
       System.out.println("entrer le montant a verser");
       int mt = sc.nextInt();
       Account a2 = new SavingAccount(11,2000,30000);
       int code2 = a2.getCode();
       System.out.println("le montant a verser est :" + mt+ "f");
       a2.verser(mt);
       System.out.println(a2.afficher(code2));   
       }
       
       if(op==1 & choix==3){         
       System.out.println("entrer le montant a verser");
       int mt = sc.nextInt();
       Account a3 = new BusinessAccount(10,10000,500000);
       int code3 = a3.getCode();
       System.out.println("le montant a verser est :" + mt+ "f");
       a3.verser(mt);
       System.out.println(a3.afficher(code3));
       }
       
       else if(op==2 & choix==1 ){     
       System.out.println("entrer le montant a retirer");
       int mt = sc.nextInt();
       Account a1 = new CheckingAccount(10,10000,500000);
       int code1 = a1.getCode();
       System.out.println("le montant a retirer est :" + mt+ "f");
       a1.retirer(mt);
       System.out.println(a1.afficher(code1));
      }
       
        else if(op==2 & choix==2 ){     
       System.out.println("entrer le montant a retirer");
       int mt = sc.nextInt();
       Account a2 = new SavingAccount(11,10000,500000);
       int code2 = a2.getCode();
       System.out.println("le montant a retirer est :" + mt+ "f");
       a2.retirer(mt);
       System.out.println(a2.afficher(code2));
      }
        
         else if(op==2 & choix==3 ){     
       System.out.println("entrer le montant a retirer");
       int mt = sc.nextInt();
       Account a3 = new BusinessAccount(11,10000,500000);
       int code3 = a3.getCode();
       System.out.println("le montant a retirer est :" + mt+ "f");
       a3.retirer(mt);
       System.out.println(a3.afficher(code3));
      }
       
       
         else if (op==3 & choix==1){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a1 = new CheckingAccount(10,10000,500000);
        int code1 = a1.getCode();
        Account a2 = new SavingAccount(11,2000,30000);
        int code2 = a2.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a1.virement( a2, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a1.afficher(code1));
        System.out.println("le Compte beneficiaire:" + a2.afficher(code2));
       }
         
         else if (op==3 & choix==1){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a1 = new CheckingAccount(10,10000,500000);
        int code1 = a1.getCode();
        Account a3 = new BusinessAccount(12,2000,30000);
        int code3 = a3.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a1.virement( a3, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a1.afficher(code1));
        System.out.println("le Compte beneficiaire:" + a3.afficher(code3));
       }
         
          else if (op==3 & choix==2){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a2 = new SavingAccount(11,10000,500000);
        int code2 = a2.getCode();
        Account a1 = new CheckingAccount(10,2000,30000);
        int code1 = a1.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a2.virement( a1, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a2.afficher(code2));
        System.out.println("le Compte beneficiaire:" + a1.afficher(code1));
       }
          
           else if (op==3 & choix==2){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a2 = new SavingAccount(11,10000,500000);
        int code1 = a2.getCode();
        Account a3 = new BusinessAccount(12,2000,30000);
        int code3 = a3.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a2.virement( a3, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a2.afficher(code1));
        System.out.println("le Compte beneficiaire:" + a3.afficher(code3));       
       }
           
          else if (op==3 & choix==3){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a3 = new BusinessAccount(12,10000,500000);
        int code3 = a3.getCode();
        Account a1 = new CheckingAccount(10,2000,30000);
        int code1 = a1.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a3.virement( a1, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a3.afficher(code1));
        System.out.println("le Compte beneficiaire:" + a1.afficher(code3));
       }
          
          else if (op==3 & choix==3){
            //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        Account a3 = new BusinessAccount(10,10000,500000);
        int code3 = a3.getCode();
        Account a2 = new SavingAccount(11,2000,30000);
        int code2 = a2.getCode();
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        a3.virement( a2, montant);
        System.out.println("---------------------"); 
        System.out.println("le cheickingAccount:" + a3.afficher(code3));
        System.out.println("le Compte beneficiaire:" + a2.afficher(code2));
       }
         
      
               
       else System.out.println("choisir une operation a faire");
              
    
            }
        }
     
       
       
   

  /*    //virement
        System.out.println("entrer le montant a tranferer");
        int montant = sc.nextInt();
        
        System.out.println("entrer le code du compte beneficiaire");
        int cod = sc.nextInt(); 
        
        a1.virement( a2, montant);
        System.out.println("---------------------");
        
        System.out.println("le cheickingAccount:" + a1.afficher(code1));
        System.out.println("le Compte beneficiaire:" + a2.afficher(code2));
       */
       
     
       
     
       
       
       /*Account a2 = new SavingAccount(11,2000,30000);
       int code2 = a2.getCode();
       
       BusinessAccount a3 = new BusinessAccount(12,60000,25000);
       int code3 = a3.getCode();
       //methode afficher
       System.out.println(a1.afficher(code1));
       System.out.println(a2.afficher(code2));
       System.out.println(a3.afficher(code3));
       
       //methode verser
       System.out.println("le client va verser 10000 sur son Checkingcompte");
       a1.verser(code1,10000);
       System.out.println(a1.afficher(code1));
       
       //methode retirer
       System.out.println("le client va retire 600000 sur son compte business");
       a3.retirer(code3, 600000);
       System.out.println(a3.afficher(code3));
       
   */ }

   
    

