1. Количество заявок в БД;

SELECT COUNT (*) FROM MOCK_DATA;

(count 50)

2. Количество заявок, где возраст клиентов больше 25 лет;

SELECT COUNT (*) FROM MOCK_DATA 
	WHERE DATE_PART('year', '2020-12-24'::date) - DATE_PART('year', birthdate::date) > 25;

(count 42)

3. Количество заявок, где выполняется условие: 	
- Доходы более 30 000 рублей;

SELECT COUNT (*) FROM MOCK_DATA 
	WHERE mock_data.monthlyincome > 30000;

(count 46)

- Расходы равны 0;

SELECT COUNT (*) FROM MOCK_DATA 
	WHERE mock_data.expence = 0;

(count 0)

- Должность равен "Кладовщик" или "Оператор".

SELECT COUNT (*) FROM MOCK_DATA 
	WHERE mock_data.position = 'Оператор' 
	OR mock_data.position = 'Кладовщик';

(count 16)

4. ID_Request, MonthlyIncome, Expense по заявкам, где возраст больше 30 лет и должность 
равен "Водитель". Результат отсортировать по полю BirthDate.

SELECT ID_Request, MonthlyIncome, mock_data.expence FROM MOCK_DATA 
	WHERE DATE_PART('year', '2020-12-24'::date) - DATE_PART('year', birthdate::date) > 30
	AND position = 'Водитель'
	ORDER BY birthdate;

(Результат сохранен отдельно в папке)


5. ID_Request, MonthlyIncome, Position по заявкам, где возраст менее 30 лет и имя клиента 
равен "Азат". Результат отсортировать по полю MonthlyIncome.

SELECT ID_Request, MonthlyIncome, Position FROM MOCK_DATA
	WHERE (split_part(fio, ' ', 1) = 'Азат')
	AND DATE_PART('year', '2020-12-24'::date) - DATE_PART('year', birthdate::date) < 30
	ORDER BY MonthlyIncome;

Так как Азата у меня в таблице не было, проверил на имени 'Terra'

SELECT ID_Request, MonthlyIncome, Position FROM MOCK_DATA
	WHERE (split_part(fio, ' ', 1) = 'Terra')
	AND DATE_PART('year', '2020-12-24'::date) - DATE_PART('year', birthdate::date) < 30
	ORDER BY MonthlyIncome;

(Результат сохранен отдельно в папке)