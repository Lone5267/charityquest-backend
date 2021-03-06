package com.forever17.project.charityquest.services;

import com.forever17.project.charityquest.exceptions.SystemInternalException;
import com.forever17.project.charityquest.pojos.CharityUser;
import com.forever17.project.charityquest.pojos.Message;
import com.forever17.project.charityquest.pojos.entity.ReturnStatus;

/**
 * CharityUserService Interface
 *
 * @author Yuhao Hu (Yhu74@sheffield.ac.uk)
 * @version 1.0
 * @date 07/03/2020
 * @since 1.0
 */
public interface CharityUserService {
    /**
     * add a new Charity user into database
     *
     * @param charityUser object of public user
     * @return instance of ReturnStatus
     * @throws SystemInternalException exception
     */
    ReturnStatus addUser(CharityUser charityUser) throws SystemInternalException;

    /**
     * check whether email has already been registered by other public or charity.
     *
     * @param email email address
     * @return instance of ReturnStatus
     */
    ReturnStatus checkEmail(String email);

    /**
     * check whether user exist and password is correct
     *
     * @param email    email of public user
     * @param password password of user
     * @return instance of ReturnStatus
     */
    ReturnStatus signIn(String email, String password) throws SystemInternalException;

    /**
     * change password of public user
     *
     * @param charityId id of charity user
     * @param password  password of charity user
     * @return instance of ReturnStatus
     */
    ReturnStatus changePassword(String charityId, String password) throws SystemInternalException;

    /**
     * show the profile of charity user
     *
     * @param id id of charity user
     * @return instance of ReturnStatus
     */
    ReturnStatus showProfile(String id);

    /**
     * update profile of charity user
     *
     * @param charityUser instance of charity user
     * @return instance of ReturnStatus
     */
    ReturnStatus updateUser(CharityUser charityUser);

    /**
     * get list of draft messages
     *
     * @param id       id of charity
     * @param pageNum  number of page
     * @param pageSize size of page
     * @return instance of ReturnStatus
     */
    ReturnStatus getDraftMessageList(String id, int pageNum, int pageSize);

    /**
     * get list of sent messages
     *
     * @param id       id of charity
     * @param pageNum  number of page
     * @param pageSize size of page
     * @return instance of ReturnStatus
     */
    ReturnStatus getSendMessageList(String id, int pageNum, int pageSize);

    /**
     * send message
     *
     * @param id id of message
     * @return instance of ReturnStatus
     */
    ReturnStatus resendMessage(String id);

    /**
     * save or update message
     *
     * @param message instance of message
     * @return instance of ReturnStatus
     */
    ReturnStatus saveOrUpdateMessage(Message message);

    /**
     * Dashboard: show total donation amount.
     *
     * @param id id of charity
     * @return instance of ReturnStatus
     */
    ReturnStatus showDonationAmount(String id);

    /**
     * Dashboard: show history of donation.
     *
     * @param id id of charity
     * @return instance of ReturnStatus
     */
    ReturnStatus showDonationHistory(String id);

    /**
     * Dashboard: show location of donation.
     *
     * @param id id of charity
     * @return instance of ReturnStatus
     */
    ReturnStatus showDonationLocation(String id);
}
