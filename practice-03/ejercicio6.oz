local Max in
  local A in
    local B in
      local C in
        Max = proc {$ X Y ?R}
          local T0 in
            T0 = (X >= Y)
            if T0 then R = X
            else R = Y
            end
          end
          end
        A = 3
        B = 2
        local Res in
          {Max A B Res}
          {Browse Res}
        end
      end
    end
  end
end
