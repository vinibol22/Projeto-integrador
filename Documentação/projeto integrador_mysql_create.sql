CREATE TABLE `Temas` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`Descricao` varchar(400) NOT NULL,
	`Tema-tipo` varchar(400) NOT NULL,
	`Palavra-chave` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Postagem` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`Titulo` varchar(255) NOT NULL,
	`texto` varchar(5000) NOT NULL,
	`localizacao` varchar(255) NOT NULL,
	`data` TIMESTAMP NOT NULL,
	`tema_id` bigint NOT NULL,
	`usuario_id` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255) NOT NULL,
	`e-mail` varchar(255) NOT NULL,
	`senha` varchar(500) NOT NULL,
	`Coletor` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk0` FOREIGN KEY (`tema_id`) REFERENCES `Temas`(`id`);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk1` FOREIGN KEY (`usuario_id`) REFERENCES `Usuario`(`id`);




