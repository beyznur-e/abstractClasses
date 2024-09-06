public abstract class GameCalculator {
    public abstract void hesapla();


    public final void gameOver(){ //Bu metot artık hiçbir zaman değişmez . Override edilemez.
        System.out.println("Oyun bitti.");
    }
}
//Abstract class da abstract metot bulunmak zorunda değil.Abstract metotlar sadece abstract sınıflarda bulunabilir.
//Abstract sınıflar tek başına kullanılamaz yani main sınıfında  new ...; olmaz. İçindeki abstract metodu da override yaparsak o zaman hata vermez. Örnek aşağıda.
//GameCalculator gameCalculator = new GameCalculator() {
//    @Override
//    public void hesapla() {
//    }
//};