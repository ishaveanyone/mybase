/**
  分割字符串
    f_string :源字符串
    f_delimiter : 分割字符
*/
create or replace function split(
    IN f_string text,
    IN f_delimiter varchar(10)
) returns setof text as
$ytt$
declare cnt int;
    declare i int;
    declare v_result text;
begin
    i := 1;
    cnt := length(f_string) - length(replace(f_string,f_delimiter,''))+1;
    while i <= cnt
        loop
            v_result := split_part(f_string,f_delimiter,i);
            return next v_result;
            i := i + 1;
        end loop;
end;
$ytt$ language plpgsql;