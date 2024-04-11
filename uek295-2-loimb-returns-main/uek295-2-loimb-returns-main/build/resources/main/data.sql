
INSERT INTO
    authorities (authorities_id, authority_name)
VALUES
    ('1', 'READ'),
    ('2', 'UPDATE'),
    ('3', 'CREATE'),
    ('4', 'DELETE');

INSERT INTO
    roles (roles_id, roles_name)
VALUES
    ('1', 'ADMIN'),
    ('2', 'USER');

INSERT INTO
    roles_authorities (authorities_id, roles_id)
VALUES
    ('1', '1'), ('2', '1'), ('3', '1'), ('4', '1'),
    ('1', '2');

INSERT INTO
    "user" (role_roles_id, user_id, user_name, user_password)
VALUES
    ('1', '1', 'admin', '12345678'),  -- admin hat Rolle ID 1 (ADMIN)
    ('2', '2', 'loris', '1234'),  -- loris hat Rolle ID 2 (USER)
    ('1', '3', 'user', '12345678');   -- user hat auch Rolle ID 1 (ADMIN)

INSERT INTO
    "returns" ("returns_order_id", "returns_amount", "returns_reason")
VALUES
    (1, 1, 'The product is broken');
