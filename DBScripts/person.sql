-- Пароль такой же как и логин, просто зашифрован
-- Если логин "a", то и пароль "a"
INSERT INTO public.person (id, login, password, name) VALUES (29, 'a', '$2a$10$Gz/JvQwF8MOLnZaY7Y0zEeF/7yRM5w2UYkJJDRyDPtxgGbkJ8Alpy', 'Alex Hirsch');
INSERT INTO public.person (id, login, password, name) VALUES (30, 'j', '$2a$10$cHMBMYZDxlhGs/cQ2i0NNebGn9kcc2vK6Ktfgr9rI/H/5QPmOy4T.', 'john carmack');
INSERT INTO public.person (id, login, password, name) VALUES (31, 'm', '$2a$10$2CPCdNhJTuihA5F4zG8iReUB5dVrfmNFemrA6VbEEg3AaQz5Mc9Ve', 'american mcgee');
INSERT INTO public.person (id, login, password, name) VALUES (32, 'g', '$2a$10$RlNqL3wjaNJ/fr2bRfaE9u.E7hLqh1cGD2zh/dp6V/QX6XOVK..ky', 'gabe newell');
INSERT INTO public.person (id, login, password, name) VALUES (28, 's', '$2a$10$qp8vn2BhFD3piVG6RRmOZOFEEgPMdh5yjcAtfcHFhq3ZC4yoPWiKC', 'Sin Jin');
