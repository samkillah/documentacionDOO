package edu.uco.budget.service.usecase.budget.implementation;

import edu.uco.budget.crosscuting.messages.Messages;
import edu.uco.budget.data.daofactory.DAOFactory;
import edu.uco.budget.domain.BudgetDTO;
import edu.uco.budget.service.usecase.budget.FindBudgetUseCase;

import java.util.List;

public class FindBudgetUseCaseImpl implements FindBudgetUseCase {

    private final DAOFactory factory;

    public FindBudgetUseCaseImpl(DAOFactory factory){
        this.factory = factory;
    }

    @Override
    public List<BudgetDTO> execute(BudgetDTO budget) {
        return factory.getBudgetDAO().find(budget);
    }
}
