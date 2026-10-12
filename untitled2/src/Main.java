//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Egz_praktyczny egz = new Egz_praktyczny("Poslki",LocalDate.of(2026,10,12),"Ustna","Matura ustna");
    egz.start(LocalTime.of(12,0));
    egz.stop();

    System.out.println("Forma: " + egz.getForma());
    System.out.println("Opis: " + egz.getOpis());
    System.out.println("Godzina rozpoczęcia: " + egz.getGodzina_rozpoczecia());
    System.out.println("Godzina zakończenia: " + egz.getGodzina_zakonczenia());
}
