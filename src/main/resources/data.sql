INSERT INTO accounts(account_balance, currency_code, owner_id, account_type)VALUES (5000, 'USD', 1, 'SAVINGS');

INSERT INTO accounts(account_balance, currency_code, owner_id, account_type)VALUES (700, 'PLN', 1, 'CHECKING');

INSERT INTO accounts(account_balance, currency_code, owner_id, account_type)VALUES (4000, 'PLN', 2, 'CHECKING');
INSERT INTO accounts(account_balance, currency_code, owner_id, account_type)VALUES (3000, 'PLN', 3, 'CHECKING');

INSERT INTO user_profile(country, date_of_birth, language)
VALUES ('Poland', '1995-04-12', 'polish');

INSERT INTO user_profile(country, date_of_birth, language)
VALUES ('USA', '1986-09-23', 'english');

INSERT INTO users(first_name, last_name, profile_id) VALUES ('Jakub', 'Nowak', 1);
INSERT INTO users(first_name, last_name, profile_id) VALUES ('Bruce', 'Smith', 2);

UPDATE user_profile SET user_id = 1 WHERE profile_id = 1;
UPDATE user_profile SET user_id = 2 WHERE profile_id = 2;
