-- Заполнение таблицы объявлений
INSERT INTO ads(
    id   , author_id , price,  title )
VALUES
    (1,12,13545,'Несмотря на то, что это недорогой гаджет, Redmi Note 12 оснащен 120-герцовой 6,67-дюймовой OLED-панелью с разрешением Full HD+.' ||
                     ' Тыльная камера двойная, на 48 и 2 Мп. Селфи-камера 8-мегапиксельная. У девайса 4, 6 или 8 ГБ ОЗУ формата LPDDR4x и накопитель ' ||
                     'типа UFS 2.2 на 128 или 256 ГБ. Внутри батарея на 5000 мА*ч с быстрой зарядкой мощностью 33 Вт.У Redmi Note 12 есть защита IP53, ' ||
                     '3,5-мм джек для наушников, боковой сканер отпечатков пальцев и порт USB-C. Цвета — белый, черный или синий. '),
    (2,5,21999,'Электросамокат Xiaomi Mi Electric Scooter Essential станет вашим надежным спутником в путешествии по улицам города. Модель отличается' ||
                    ' сравнительно небольшим собственным весом, что вкупе с удобной площадкой для ног и продуманным органам управления обеспечивает комфортное' ||
                    ' использование. Для контроля за скоростью и уровнем заряда предусмотрен дисплей на руле. Также есть фонарь для безопасного движения в темноте.'),
    (3,25,4580,'Мультиварка Galaxy GL2645 выполнена в черно-серебристой расцветке из металла и пластика. Главным достоинством представленной 5-литровой ' ||
                    'модели является возможность готовить всевозможные блюда, используя 11 автоматических программ. За счет того, что антипригарное покрытие' ||
                    ' чаши выполнено из тефлона, вам не придется переживать за то, что каша на молоке или картошка во фритюре могут пригореть. Мультиварка ' ||
                    'мощностью 900 Вт управляется при помощи кнопок и дисплея.');