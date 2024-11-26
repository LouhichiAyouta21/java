//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout des employés
        Employe emp1 = new Employe(1, "Ali", "Hassen", "IT", 3);
        Employe emp2 = new Employe(2, "Ahmed", "Salem", "RH", 1);
        Employe emp3 = new Employe(3, "Sara", "Mounir", "IT", 2);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Affichage des employés
        System.out.println("Liste des employés:");
        societe.displayEmploye();

        // Tri par ID
        System.out.println("\nTri par ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par Département et Grade
        System.out.println("\nTri par Département et Grade:");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Recherche
        System.out.println("\nRecherche employé par nom (Ali): " + societe.rechercherEmploye("Ali"));

        // Suppression
        societe.supprimerEmploye(emp1);
        System.out.println("\nListe après suppression:");
        societe.displayEmploye();
        }
    }
