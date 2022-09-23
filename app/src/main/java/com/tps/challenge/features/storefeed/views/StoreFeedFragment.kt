package com.tps.challenge.features.storefeed.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.tps.challenge.Constants
import com.tps.challenge.TCApplication
import com.tps.challenge.databinding.FragmentStoreFeedBinding
import com.tps.challenge.features.storefeed.IClickListener
import com.tps.challenge.features.storefeed.StoreFeedAdapter
import com.tps.challenge.features.storefeed.repository.StoreFeedRepositoryImpl
import com.tps.challenge.features.storefeed.viewModel.StoreFeedViewModel
import com.tps.challenge.features.storefeed.viewModel.StoreFeedViewModelFactory
import com.tps.challenge.network.TPSApi
import com.tps.challenge.network.model.StoreResponse

/**
 * Displays the list of Stores with its title, description and the cover image to the user.
 */
class StoreFeedFragment : Fragment(), IClickListener {
    companion object {
        const val TAG = "StoreFeedFragment"
    }
    private lateinit var storeFeedAdapter: StoreFeedAdapter
    private lateinit var storesRecyclerView : RecyclerView
//    private lateinit var swipeRefreshLayout : SwipeRefreshLayout
    private lateinit var binding: FragmentStoreFeedBinding

    private var clickListener: IClickListener? = null

    private val storeViewModel by lazy {
        ViewModelProvider(
            this,
            StoreFeedViewModelFactory(
                StoreFeedRepositoryImpl(TPSApi.retrofitService)
            )
        )[StoreFeedViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        TCApplication.getAppComponent().inject(this)
        super.onCreate(savedInstanceState)
        setupClickListener()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStoreFeedBinding.inflate(inflater, container, false)
//            swipeRefreshLayout = it.swipeContainer
        binding.lifecycleOwner = this
        // Enable if Swipe-To-Refresh functionality will be needed
//        swipeRefreshLayout.isEnabled = false
        setupRecyclerView()
        storeViewModel.fetchStoreFeed(Constants.DEFAULT_LATITUDE, Constants.DEFAULT_LONGITUDE)

        return binding.root
    }

    private fun setupClickListener() {
        if (clickListener == null) {
            clickListener = this
        }

    }

    private fun setupRecyclerView() {
        storeFeedAdapter = StoreFeedAdapter()
        storesRecyclerView = binding.storesView
        storesRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = storeFeedAdapter
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        storeViewModel.storeFeedList.observe(viewLifecycleOwner) { storeFeedList ->
            storeFeedAdapter.submitList(storeFeedList)
        }
    }

    override fun onStoreItemClick(storeFiItem: StoreResponse) {
        navigateToDetailsFragment()
    }

    private fun navigateToDetailsFragment() {

    }
}
