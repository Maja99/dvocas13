#Laboratorijske vežbe za dvočas br. 13

##Zadatak 1
*(radi ga laborant u saradnji sa studentima)*

Napraviti javnu klasu **TekstDemo** u paketu **zadatak1.poslovna_logika** koja ima:

1. Javnu metodu **ucitajTekst** koja kao ulazni argument prima naziv tekstualnog fajla. Ova metoda učitava
sav tekst iz ovog fajla i vraća ga u vidu jednog String-a. Ako se u toku izvršavanja desi neka
greška ili fajl ne postoji, potrebno je da ova metoda vrati null. Potrebno je obratiti pažnju na
znak za kraj reda tj. povratni String treba da sadrži i znakove za kraj reda na kraju svakog
reda.

2. Javnu metodu **upisiTekst** koja kao ulazni argument prima dva String-a: prvi predstavlja naziv
tekstualnog fajla, a drugi neki tekst. Ova metoda upisuje ga tekst u tekstualni fajl sa zadatim
imenom.

Napraviti vizuelnu klasu **TekstEditorGUI** u paketu **zadatak1.gui** koja izgleda kao na
slici. Centralni deo ekrana bi trebalo da bude editor za tekst. Kada se promeni dimenzija forme,
trebalo bi da se ovaj centralni deo poveća/smanji a da ostale komponente ostanu na istom mestu.

1. Kada se klikne na dugme “Obriši”, briše se tekst koji se nalazi u editoru. 

2. Kada se klikne na dugme“Učitaj”, iz polja za unos se preuzima ime tekstualnog fajla, učitava se tekst iz tog fajla i prikazuje u okviru editora. Učitavanje je potrebno vršiti pozivanjem metoda klase **TekstDemo**

3. Kada se klikne na dugme “Sačuvaj”, sav tekst koji se trenutno nalazi u editoru se upisuje u fajl čije ime se nalazi u polju za unos. Upisivanje je potrebno vršiti pozivanjem metoda klase **TekstDemo** 

4. Kada se klikne **Replace** stavka u meniju da se otvori dijalog u koji korisnik unosi string koji treba zameniti, i string kojim treba zameniti, a zatim nakon klika na dugme **OK** u dijalogu, vrši zamenu svih pojavljivanja stringa u tekstu u editoru.

5. Kada se klikne na dugme “Izadji”, prekida se izvršavanje programa. **(prekidanje programa iz koda tj. System.exit(0))**