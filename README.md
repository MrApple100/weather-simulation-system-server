# Сервер проекта по Системе симуляции окружающей среды
REST API сервер на Spring. Реализует взаимодействие между мобильным приложением и различными компонентами системы

# Запуск
0) Необходим Docker Compose
1) Переходим в папку **\weather-compose**
2) Прописываем команду ``` docker compose up --build  ```

```
# API
Шаблоны:
- /templates (GET - получение списка, POST - добавление нового шаблона)
- /templates/{id} (GET - получение конкретного шаблона)

Окружение:
- /environments/scene (GET - получение всех возможных сцен)
- /environments/time (GET - получение всего возможного времени суток)
- /environments/video (GET - получение всех видео)
- /environments/voice (GET - получение всех дополнительных звуков)
- /environments/wheather (GET - получение всех погод)

Устройства:
- /devices/fan (GET - получение состояния вентилятора, PUT - установка нового состояния, необходим параметр state)
- /devices/freshener (GET - получение состояния освежителя воздуха, PUT - установка нового состояния, необходим параметр state)
- /devices/humidifier (GET - получение состояния увлажнителя воздуха, PUT - установка нового состояния, необходим параметр state)
