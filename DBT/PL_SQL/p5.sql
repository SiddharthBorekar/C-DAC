drop procedure if exists p4;
delimiter $
create procedure p5(IN ioID int ,iproductName varchar(20),IN irate int,IN iqty int) -- sequence imp

	begin
		rollback;
        select "Rollbacked...";
    end;
    start transaction read write;
		insert into orders values(ioid,new());-- sequence imp
        insert into orderdetails(oID,productName,rate,iqty) values (101,1);
        values(ioid,iproductName,irate,iqty);
        commit;
			select "Record inserted....";
end $
    delimiter 