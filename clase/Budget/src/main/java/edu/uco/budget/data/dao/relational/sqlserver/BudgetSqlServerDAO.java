package edu.uco.budget.data.dao.relational.sqlserver;

import edu.uco.budget.data.dao.BudgetDAO;
import edu.uco.budget.data.dao.PersonDAO;
import edu.uco.budget.data.dao.YearDAO;
import edu.uco.budget.domain.BudgetDTO;

import java.util.List;
import java.util.UUID;

public final class BudgetSqlServerDAO implements BudgetDAO {

    @Override
    public final void create(BudgetDTO budget) {

    }

    @Override
    public final List<BudgetDTO> find(BudgetDTO budget) {
        return null;
    }

    @Override
    public final void update(BudgetDTO budget) {

    }

    @Override
    public final void delete(UUID id) {

    }
}
