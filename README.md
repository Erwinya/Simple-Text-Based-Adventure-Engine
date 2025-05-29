# Text-Based Adventure Game

Bu proje, Java ile geliştirilmiş bir metin tabanlı macera oyunudur. Oyuncular farklı karakterler seçebilir, düşmanlarla savaşabilir, eşya toplayabilir ve Aetheria dünyasını kurtarmaya çalışabilirler.

## Özellikler

- 4 farklı karakter sınıfı (Savaşçı, Suikastçı, Büyücü, Şifacı)
- 5 farklı lokasyon (Güvenli Ev, Ghua Pazarı, Gölgeler Ormanı, Karanlık Mağaralar, Boşluk Diyarı Kapısı)
- 3 farklı düşman tipi (Void Minion, Shadow Beast, Void Lord)
- Silah ve zırh sistemi
- Para sistemi
- Nadir eşya toplama sistemi
- Can yenileme sistemi
- Oyun kaydetme/yükleme sistemi
- Detaylı olay kaydı

## Gereksinimler

- Java 17 veya üzeri

## Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/yourusername/Simple-Text-Based-Adventure-Engine.git
```

2. Proje dizinine gidin:
```bash
cd Simple-Text-Based-Adventure-Engine
```

3. Projeyi derleyin:
```bash
cd src
javac com/halukkilincer/adventure/launcher/Game.java
```

4. Oyunu başlatın:
```bash
java com.halukkilincer.adventure.launcher.Game
```

## Oyun Kontrolleri

- Menülerde gezinmek için 1-4 arası sayıları kullanın
- Karakter seçimi için S, A, B, H tuşlarını kullanın
- Savaş sırasında:
  - Vurmak için V tuşuna basın
  - Kaçmak için K tuşuna basın

## Oyun İpuçları

1. Oyuna başlarken Güvenli Ev'de canınızı yenileyebilirsiniz
2. Ghua Pazarı'ndan silah ve zırh satın alın
3. Gölgeler Ormanı'ndan Orman Parşömeni'ni toplayın
4. Karanlık Mağaralar'dan Kadim Taş'ı elde edin
5. Son olarak Boşluk Diyarı Kapısı'nda Void Lord ile savaşın

## Katkıda Bulunma

1. Bu depoyu fork edin
2. Yeni bir branch oluşturun (`git checkout -b feature/amazing-feature`)
3. Değişikliklerinizi commit edin (`git commit -m 'Add some amazing feature'`)
4. Branch'inizi push edin (`git push origin feature/amazing-feature`)
5. Bir Pull Request oluşturun

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.
