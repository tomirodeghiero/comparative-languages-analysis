proc {Loop5 I}
  local C in
    C = I == 5
    if C then skip
    else
      local J in
        J = I + 5
        {Loop5 J}
      end
    end
  end
end
