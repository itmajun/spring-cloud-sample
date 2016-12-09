INSERT INTO role (id,create_date,modify_date,description,name) VALUES (1,NOW(),NOW(),'管理员','管理员');
INSERT INTO role (id,create_date,modify_date,description,name) VALUES (2,NOW(),NOW(),'test','test');

INSERT INTO role_authority (role_id,authorities) VALUES (1, 'user:add');
INSERT INTO role_authority (role_id,authorities) VALUES (1, 'user:update');
INSERT INTO role_authority (role_id,authorities) VALUES (1, 'user:delete');
INSERT INTO role_authority (role_id,authorities) VALUES (1, 'user:find');


INSERT INTO user (id,create_date,modify_date,is_enabled,login_date,login_failure_count,login_ip,name,password,username) VALUES (1,NOW(),NOW(),1,NOW(),0,'192.168.0.144','majun','123456','jun');
INSERT INTO user_role(users_id,roles_id) VALUES (1,1);
INSERT INTO user_role(users_id,roles_id) VALUES (1,2);