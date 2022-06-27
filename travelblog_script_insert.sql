/*

Script insert data into the tables

*/
USE blog_sys;


-- user table
insert into user ( user_id,firstName,lastName,email,
  passwordHash,registeredAt,lastLogin, intro,user_profile )
value (1,"Valerie","Pavolo","valeroe.p@gmail.com","pavolo8746","2021-03-10","2022-05-19",
"Welcome to my travel blog! Travelling is one of the best thing to do. It shows me how beautiful world is. It's giving me lessons,experiences and memories.",
"I'm the woman who loves travelling and wants see all the world!"),
(2, "Tom", "Bruek", "bek.t@gmail.com", "bu190", "2021-02-12", "2022-03-11", "Welcome to my travel blog! Travelling is one of the best thing to do. It shows me how beautiful world is. It's giving me lessons,experiences and memories.", "I'm the man who loves travelling and wants see all the world!"), 
(3, "Christian", "Collon", "chris85@gmail.com", "C4h50", "2021-02-03", "2022-05-08", "Welcome to my travel blog! Travelling is one of the best thing to do. It shows me how beautiful world is. It's giving me lessons,experiences and memories.", "I'm the man who loves travelling and wants see all t");


insert into post (post_id,title,metaTitle,slug,summary,published,content, user_id, post_img)
value (1,"Beautiful Island!!","island,relax,travel","island-trip",
"When you don't know where to spend your holiday small Island is the best option for your family!! It's a place full of nature, animals and only positive people!! Follow up with my tips in the post and I guaranted you amazig time!",
0,"family holiday",1, "1"),
(2,"Amazing mountains!","winter,travel,view","winter-season","For all snowboarding lover that is the best place! Check my post to see amazing skiing route!",0,"winter holiday",2,"2"),
(3,"Lazy holiday!","summer,sea,sunshine","sunny-holiday","If you want to spend all day relaxing in the beach, far away from the other people that is the best place for you! Check in the post where you can hide from everyone!",0,"time for myself",3,"3");

update post set post_img =  "image1" where post_img ="img_1,jpg" and user_id = 1;
update post set post_img =  "image2" where post_img ="img_2,jpg" and user_id = 2;
update post set post_img =  "image3" where post_img ="img_3,jpg" and user_id = 3;

insert into post_meta(post_meta_id,post_Id,meta_key, content)
value (1,1,1,"Learn more"),(2,2,2,"I love this place!"),
(3,3,3,"What a useful tips!");

Insert into post_comment (post_comment_id, post_id, parent_id, published, content) 
values 
(1, 1, 1, 0, "Why I enjoy travelling"),
(2,2,2,0,"I love this place!"),
(3,3,3,0,"What a useful tips!");

insert into post_category( post_id, category_id)
value (1,1), (2,2),(3,3);

Insert into category (category_id, parent_id, title, metaTitle,slug,content) 
values (1, 10, "Nature", "Natural park", "Holidaytravel", "Glacier National Park"), 
(2, 11, "Travel", "Island", "Holidaytravel", "Maldives"), 
(3, 12,"Mountain", "Skiing", "Holidaytravel", "France");

 
select * from user;
select * from post;
select * from post_comment;
select * from post_meta;
select * from post_comment;
select * from post_category;
select * from category;
		


