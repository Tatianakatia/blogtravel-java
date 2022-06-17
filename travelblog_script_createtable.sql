CREATE DATABASE blog_sys;
  
USE blog_sys;

-- Table structure for table "user"
-- drop database blog_sys;

CREATE TABLE user (
  user_id BIGINT NOT NULL AUTO_INCREMENT,
  firstName VARCHAR(50) NULL DEFAULT NULL,
  lastName VARCHAR(50) NULL DEFAULT NULL,
  email VARCHAR(50) NULL,
  passwordHash VARCHAR(32) NOT NULL,
  registeredAt DATETIME NOT NULL,
  lastLogin DATETIME NULL DEFAULT NULL,
  intro TINYTEXT NULL DEFAULT NULL,
  user_profile TEXT NULL DEFAULT NULL,
  PRIMARY KEY (user_id));
  
  -- Table structure for table "post"

  CREATE TABLE post (
  post_id BIGINT NOT NULL AUTO_INCREMENT,
  user_id BIGINT NOT NULL,
 -- author_id BIGINT NOT NULL,
  title VARCHAR(75) NOT NULL,
  metaTitle VARCHAR(100) NULL,
  slug VARCHAR(100) NOT NULL,
  summary TINYTEXT NULL,
  published TINYINT NOT NULL DEFAULT 0,
  createdAt DATETIME DEFAULT CURRENT_TIMESTAMP,
  updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  publishedAt DATETIME DEFAULT CURRENT_TIMESTAMP,
  content TEXT NULL DEFAULT NULL,
  PRIMARY KEY (post_id),
    FOREIGN KEY (user_id) REFERENCES user (user_id));
    
    -- Table structure for table "post_meta"
    
CREATE TABLE post_meta (
  post_meta_id BIGINT NOT NULL AUTO_INCREMENT,
  post_Id BIGINT NOT NULL,
  meta_key VARCHAR(50) NOT NULL,
  content TEXT NULL DEFAULT NULL,
  PRIMARY KEY (post_meta_id),
    FOREIGN KEY (post_Id) REFERENCES post (post_Id));


    
    -- Table structure for table "post_comment"

CREATE TABLE post_comment (
  post_comment_id BIGINT NOT NULL AUTO_INCREMENT,
  post_id BIGINT NOT NULL,
  parent_id BIGINT NULL DEFAULT NULL,
  published TINYINT NOT NULL DEFAULT 0,
  createdAt DATETIME DEFAULT CURRENT_TIMESTAMP,
  publishedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  content TEXT NULL DEFAULT NULL,
  PRIMARY KEY (post_comment_id),
	FOREIGN KEY (post_id) REFERENCES post (post_id));
    
    -- Table structure for table "category"
  
  CREATE TABLE category (
  category_id BIGINT NOT NULL AUTO_INCREMENT,
  parent_id BIGINT NULL DEFAULT NULL,
  title VARCHAR(75) NOT NULL,
  metaTitle VARCHAR(100) NULL DEFAULT NULL,
  slug VARCHAR(100) NOT NULL,
  content TEXT NULL DEFAULT NULL,
  PRIMARY KEY (category_id));
  
-- Table structure for table "post_category"
    
  CREATE TABLE post_category (
  post_id BIGINT NOT NULL,
  category_id BIGINT NOT NULL,
  PRIMARY KEY (post_id, category_id));
  
