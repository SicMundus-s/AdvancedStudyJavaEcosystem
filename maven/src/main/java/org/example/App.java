package org.example;

/**
 * Maven:
 * 1. Project lifecycle - набор фаз. жИЗНЕННЫЕ ЦИЫКЛЫ: 1. Clean 2.Default(Build) 3. Site
 * При вызове любой из фазы вызываются все предыдущие ей фазы.
 * 1. Clean - Очистка дериктории Target у проекта
 * 2. Default:
 * 2.1 Validate - Валидирует проект
 * 2.2 compile - Компилирует файлы проекта и помещает их в target
 * 2.3 test - Запуск юнит тестов проекта
 * 2.4 package - Формирует jar/war/etc файл на основе проекта в target( который в свою очередь содержит только исходные классы без зависимостей
 * 2.5 verify - Запуск интеграционных тестов проекта
 * 2.6 install - Загружает jar/war/etc(на основе package) файл в m2reposiroty(локальный репозиторий)
 * 2.7 deploy - пушит в удалённый репозиторий артефакты на основе install
 * 3. Site - Занимается генерацией отчётов и документации по нашему проекту
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
